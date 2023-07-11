SUMMARY = "Navigate HTTP resources using WADL files as guides"
DESCRIPTION = "An Application object represents a web service described by a WADL \
file."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.6"

RPM_NAME = "python39-wadllib-1.3.6-1.10.noarch.rpm"
RPM_HASH = "8147507f41606e81de45a0ba2691f7ae7b1b590f236ca02bb381eb01085de9d590e15390a22ba0aed0354688b06be6b4ded1bdbc660d2cb7579054b0d82bcfb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wadllib \
python39-wadllib \
python3dist-wadllib"

RDEPENDS:${PN} += "python-abi \
python39-lazr.uri"

inherit rpm
