SUMMARY = "Slugify application that handles Unicode"
DESCRIPTION = "A Python Slugify application that handles Unicode."
LICENSE = "MIT"

PV = "5.0.2"

RPM_NAME = "python310-python-slugify-5.0.2-2.3.noarch.rpm"
RPM_HASH = "452414d880dc265c6a3cd8c6339d023505b431a4eaa03d8aaf336ed7b4d58627674a1d4338a36b6a1be12906d2b4e965110df4028dc1082f8998ba41d98a7060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-slugify \
python310-python-slugify \
python3dist-python-slugify"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
python310-text-unidecode \
update-alternatives"

inherit rpm
