SUMMARY = "Tool to build continuous data pipelines"
DESCRIPTION = "Streamz helps you build pipelines to manage continuous streams of data."
LICENSE = "BSD-3-Clause"

PV = "0.6.4"

RPM_NAME = "python310-streamz-0.6.4-2.5.noarch.rpm"
RPM_HASH = "3d774f0116ed0700432d64498389cc381b320bdc8c906b75273c623177a795f694f0227c86c5028bcea3072c511cbeb48f2d06062b589be4139a47ef43d403e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-streamz \
python310-streamz \
python3dist-streamz"

RDEPENDS:${PN} += "python-abi \
python310-setuptools \
python310-six \
python310-toolz \
python310-tornado \
python310-zict"

inherit rpm
