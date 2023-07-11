SUMMARY = "Email reply parser"
DESCRIPTION = "Email reply parser."
LICENSE = "MIT"

PV = "0.5.12"

RPM_NAME = "python310-email-reply-parser-0.5.12-1.9.noarch.rpm"
RPM_HASH = "3cd172ca3cc6cb76e86950f2023958eb9a82949ec1eebd6a99944750984fd947079fed8e09ec190657268a8caa0ceaa630d57e3102ad6ad7bdf7bb2967c0d969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-email-reply-parser \
python310-email-reply-parser \
python3dist-email-reply-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
