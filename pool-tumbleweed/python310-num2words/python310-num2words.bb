SUMMARY = "Modules to convert numbers to words"
DESCRIPTION = "num2words is a library that converts numbers like '42' to words like 'forty-two'. \
It supports multiple languages and can even generate ordinal numbers like 'forty-second' \
(although this last feature is a bit buggy for some languages at the moment)."
LICENSE = "LGPL-2.1-only"

PV = "0.5.12"

RPM_NAME = "python310-num2words-0.5.12-1.6.noarch.rpm"
RPM_HASH = "80af227e37114c5e3bde863352f844cb2551acef4cabc344ccb38a74a963252d23e50cdf97b24fe79d38fed9f82339d19fd3f9a791b2f335a1b3b8732b1d8a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-num2words \
python310-num2words \
python3dist-num2words"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-docopt \
update-alternatives"

inherit rpm
