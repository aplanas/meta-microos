SUMMARY = "145+ extra higher-level functional tools"
DESCRIPTION = "145+ extra higher-level functional tools that go beyond standard \
library's itertools, functools, etc. and popular third-party \
libraries like toolz, funcy, and more-itertools."
LICENSE = "MIT"

PV = "0.8.2.1"

RPM_NAME = "python310-extratools-0.8.2.1-2.14.noarch.rpm"
RPM_HASH = "488326d75190237afe6562c31757cc17172ded5278a51232dc1c6aa9b71f10ba0185c1ab1499b6399f499de970cff636b8630df525c290bbbd4c51b8d764debf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-extratools \
python310-extratools \
python3dist-extratools"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-RegexOrder \
python310-TagStats \
python310-sh \
python310-sortedcontainers \
python310-toolz \
update-alternatives"

inherit rpm
