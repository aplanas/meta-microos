SUMMARY = "CLI for MySQL Database. With auto-completion and syntax highlighting"
DESCRIPTION = "CLI for MySQL Database. With auto-completion and syntax highlighting."
LICENSE = "BSD-3-Clause"

PV = "1.26.1"

RPM_NAME = "python310-mycli-1.26.1-2.5.noarch.rpm"
RPM_HASH = "4db943ceb3e61644868e8d450b29f99f14f5b0c61628e3f821c7544d348ce5ae1a6f3218854f26b4f6851dab8f63d556701a38094dbb0602be2680fdf942a8ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mycli \
python3.10dist-mycli \
python310-mycli \
python3dist-mycli"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
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
