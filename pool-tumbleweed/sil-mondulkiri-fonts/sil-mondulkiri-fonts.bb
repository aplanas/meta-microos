SUMMARY = "The Mondulkiri Font Family"
DESCRIPTION = "The Mondulkiri fonts provide Unicode support for the Khmer script. \
 \
The Mondulkiri fonts contain all Khmer and all basic Latin characters. \
They also contain a limited number of characters used in some languages in \
Vietnam and many phonetic characters."
LICENSE = "OFL-1.1"

PV = "7.100"

RPM_NAME = "sil-mondulkiri-fonts-7.100-1.11.noarch.rpm"
RPM_HASH = "f3a34574c9da5863c51e9fb79e60a05505b81d105c7a8279f5ac2bb57e3cdc4f0eb6f96225c226a0dd3319451206b534d57cf89c6f45c2b4e84d082fa6db5a18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sil-mondulkiri-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
