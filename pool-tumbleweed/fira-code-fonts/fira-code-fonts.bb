SUMMARY = "Free monospaced font with programming ligatures"
DESCRIPTION = "Fira Code is a free monospaced font containing ligatures for common programming multi-character combinations. This is just a font rendering feature: underlying code remains ASCII-compatible. This helps to read and understand code faster."
LICENSE = "OFL-1.1"

PV = "6.2"

RPM_NAME = "fira-code-fonts-6.2-1.5.noarch.rpm"
RPM_HASH = "9318c3a845d125216a55e4569080c3d8e68a6da633986f984afb9e38cb4d57a3af0f736feb34b061446c79d09c0df152f0c37af2f2dd4c9c21719e1c29fa0363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fira-code-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
