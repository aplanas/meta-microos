SUMMARY = "Data files for the libcangjie IME"
DESCRIPTION = "libcangjie is a C library implementing the Cangjie input method, \
which is mainly used on Traditional Chinese inputing. \
 \
libcangjie-data contains the input mapping table to switch en_US \
keyboard codes to Traditional Chinese characters, and it is designed \
to be compiled into the final input engine 'ibus-cangjie'."
LICENSE = "LGPL-3.0+"

PV = "1.3"

RPM_NAME = "libcangjie-data-1.3-1.21.noarch.rpm"
RPM_HASH = "1a694fb4646a6d6a9611fcce07e5379c86f24867c547f0fe092683c13080f1910e7cb292f44c7e67bbd0fc53854fce63eef5f9b85741bd69089d14c67630f7eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcangjie-data"

RDEPENDS:${PN} += "libcangjie2"

inherit rpm
