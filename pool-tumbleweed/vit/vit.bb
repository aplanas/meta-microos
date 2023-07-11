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

RPM_NAME = "vit-2.3.0-1.2.noarch.rpm"
RPM_HASH = "13bb2da0871dac0bb4d66c04072d51267b8b3951ee22ed6cc22cc8a22dc39671645df1e0c8c7c987c509dc229f75c6cfdcc93b242bb0973c1fd465fefe1921dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-vit \
python3dist-vit \
vit"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-base \
python3-tasklib \
python3-urwid \
taskwarrior"

inherit rpm
