SUMMARY = "Visual Interactive Taskwarrior full-screen terminal interface"
DESCRIPTION = "Visual Interactive Taskwarrior full-screen terminal interface. \
Features: \
 * Fully-customizable key bindings (default Vim-like) \
 * Uncluttered display \
 * No mouse \
 * Speed \
 * Per-column colorization \
 * Advanced tab completion \
 * Multiple/customizable themes \
 * Override/customize column formatters \
 * Intelligent sub-project indenting"
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "vit-2.3.0-1.1.noarch.rpm"
RPM_HASH = "c97e3b06887641947a7a480d609f2318d9aa4134365a5613e4f46a1fc6463237ad5fcc94560ad4cf5dc70aedacd8b4ec98698e04fef8c7ca69df72cf124895b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vit \
python3dist-vit \
vit"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-base \
python3-tasklib \
python3-urwid \
taskwarrior"

inherit rpm
