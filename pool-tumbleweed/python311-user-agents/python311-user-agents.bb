SUMMARY = "A library to identify device capabilities (phones, tablets)"
DESCRIPTION = "Python library that can identify/detect devices like mobile phones, \
tablets and their capabilities by parsing (browser/HTTP) user agent \
strings."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-user-agents-2.1.0-1.13.noarch.rpm"
RPM_HASH = "2dc6f423b4f2787163f458d4bab1cdbc29577cc3744e1ee6b36141e6daafb68f3eb1726c8b7b5f9a9d8709385817164ae849564d0fdbf2c65296482a9803f90c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(user-agents) \
python311-user-agents \
python3dist(user-agents)"

RDEPENDS:${PN} += "python(abi) \
python311-PyYAML \
python311-ua-parser"

inherit rpm
