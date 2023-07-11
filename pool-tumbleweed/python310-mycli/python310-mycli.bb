SUMMARY = "CLI for MySQL Database. With auto-completion and syntax highlighting"
DESCRIPTION = "CLI for MySQL Database. With auto-completion and syntax highlighting."
LICENSE = "BSD-3-Clause"

PV = "1.26.1"

RPM_NAME = "python310-mycli-1.26.1-2.7.noarch.rpm"
RPM_HASH = "49477b78e5bb652dc3a74347b50cdd3e40fedf66f2ab0d85a921400eaf206fec657fae857ecd2c206f3bd9271c3412f2cf6b2e9950a942c5ee70f0f05ef309bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mycli \
python310-mycli \
python3dist-mycli"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyMySQL \
python310-Pygments \
python310-cli-helpers \
python310-click \
python310-configobj \
python310-cryptography \
python310-prompt-toolkit \
python310-pyaes \
python310-pyperclip \
python310-sqlglot \
python310-sqlparse \
update-alternatives"

inherit rpm
