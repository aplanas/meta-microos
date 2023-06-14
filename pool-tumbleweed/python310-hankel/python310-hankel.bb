SUMMARY = "Hankel Transformations using method of Ogata 2005"
DESCRIPTION = "Hankel is a Python library to perform simple and accurate Hankel \
transformations using the method of Ogata 2005."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python310-hankel-1.2.1-2.3.noarch.rpm"
RPM_HASH = "9bc5ba72b37fe1c7a0017415b71d159f760c92a1954eb2348ab6e1ead76e64ddd86c05325971710167d7204d49ec67ce6165a98fe6153dc5d1a5334505af35f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hankel \
python3.10dist-hankel \
python310-hankel \
python3dist-hankel"

RDEPENDS:${PN} += "python-abi \
python310-mpmath \
python310-numpy \
python310-scipy"

inherit rpm
