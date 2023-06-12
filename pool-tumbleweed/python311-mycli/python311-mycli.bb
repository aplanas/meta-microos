SUMMARY = "CLI for MySQL Database. With auto-completion and syntax highlighting"
DESCRIPTION = "CLI for MySQL Database. With auto-completion and syntax highlighting."
LICENSE = "BSD-3-Clause"

PV = "1.26.1"

RPM_NAME = "python311-mycli-1.26.1-2.5.noarch.rpm"
RPM_HASH = "becf20e5778d7ddd423227d72a967680cb354e000790eb56ce5b7111eed1c1acbbbbfdaf22eb1c86da540d2f49fb723b3102b6ab393a790e8a052678184810aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mycli) \
python311-mycli \
python3dist(mycli)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-PyMySQL \
python311-Pygments \
python311-cli-helpers \
python311-click \
python311-configobj \
python311-cryptography \
python311-prompt_toolkit \
python311-pyaes \
python311-pyperclip \
python311-sqlglot \
python311-sqlparse \
update-alternatives"

inherit rpm
