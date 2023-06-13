SUMMARY = "Tool to build continuous data pipelines"
DESCRIPTION = "Streamz helps you build pipelines to manage continuous streams of data."
LICENSE = "BSD-3-Clause"

PV = "0.6.4"

RPM_NAME = "python310-streamz-0.6.4-2.3.noarch.rpm"
RPM_HASH = "6e5b45a65db110e1d14e66b0a8c007137853ab81ad0806a17ab2ac502747a0137aa0d785d2ecd654d286706279dfb0ab312e49f4de4ec54c1e098f2dae79b0ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-streamz \
python3.10dist(streamz) \
python310-streamz \
python3dist(streamz)"

RDEPENDS:${PN} += "python(abi) \
python310-setuptools \
python310-six \
python310-toolz \
python310-tornado \
python310-zict"

inherit rpm
