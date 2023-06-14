SUMMARY = "String colorization for Python"
DESCRIPTION = "Pastel is a library to colorize strings in the terminal."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python311-pastel-0.2.1-1.5.noarch.rpm"
RPM_HASH = "6dec1665abb0acb49fb7f64b7ef54aa3828c327b98947cf153244ccd8ec8d7e246f603b539363aea72c2bc8096d1b58719652f7053d12580f7f96f2ba2bc8456"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pastel \
python311-pastel \
python3dist-pastel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
