SUMMARY = "Handles low-level interfacing for files' tags Wraps Mutagen to"
DESCRIPTION = "Handles low-level interfacing for files' tags. Wraps Mutagen to"
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python311-mediafile-0.11.0-2.3.noarch.rpm"
RPM_HASH = "cf31acf1d412e1120b2f5397253a58eaef19fac46d80fab2231db2c4385b66ec8c4dfe83c867aa7b16040e834a18b0f09d6a21fe6fe017b58d87213883eda5ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mediafile \
python3.11dist-mediafile \
python311-mediafile \
python3dist-mediafile"

RDEPENDS:${PN} += "python-abi \
python311-mutagen"

inherit rpm
