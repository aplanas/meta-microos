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

PV = "2.3.1"

RPM_NAME = "vit-2.3.1-1.1.noarch.rpm"
RPM_HASH = "ebe28fdcef6b21ecad2b78fa2864d2b013c4dd9c5c4532ba6d4e03cf51aa147581f63a4e48e3ce42f0507b1803aee70fee90f797dc765713ffdf30092f928605"
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
