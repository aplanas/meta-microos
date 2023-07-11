SUMMARY = "CLI for MySQL Database. With auto-completion and syntax highlighting"
DESCRIPTION = "CLI for MySQL Database. With auto-completion and syntax highlighting."
LICENSE = "BSD-3-Clause"

PV = "1.26.1"

RPM_NAME = "python311-mycli-1.26.1-2.7.noarch.rpm"
RPM_HASH = "726f8159a471891fa36503e70361f7d66794315177d5cafea32cd445c585f889964b1868980d7d1997780bd401d7b23267c6d9c70653ccc7569a404059667c2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mycli \
python3.11dist-mycli \
python311-mycli \
python3dist-mycli"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyMySQL \
python311-Pygments \
python311-cli-helpers \
python311-click \
python311-configobj \
python311-cryptography \
python311-prompt-toolkit \
python311-pyaes \
python311-pyperclip \
python311-sqlglot \
python311-sqlparse \
update-alternatives"

inherit rpm
