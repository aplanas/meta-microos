SUMMARY = "Terminal based emoji chooser"
DESCRIPTION = "moji is a terminal based emoji chooser for *nix. With tuimoji you can search and browse emojis and copy them to your clipboard without ever leaving the comfort of your terminal."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "tuimoji-1.0.0-1.9.noarch.rpm"
RPM_HASH = "db499056a2c7c4ba0cd575447c36c338c695fdd3c2ecd111ebb4a973da962fe42770941e7a8b995a926345946700e0f76c6525acbbce798725ec91d331e3a9f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(tuimoji) \
python3dist(tuimoji) \
tuimoji"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-urwid \
xclip"

inherit rpm
