SUMMARY = "Email reply parser"
DESCRIPTION = "Email reply parser."
LICENSE = "MIT"

PV = "0.5.12"

RPM_NAME = "python311-email-reply-parser-0.5.12-1.9.noarch.rpm"
RPM_HASH = "3c5e5faa434f4c82a1c3e873725e25d45d075fa82b2fb3c695a9218eb21561a7f0951b0e306e15c13048b9b8e139b357b40e5f6d300820fed5c661e02f84fc98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-email-reply-parser \
python3.11dist-email-reply-parser \
python311-email-reply-parser \
python3dist-email-reply-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
