SUMMARY = "Tool to build continuous data pipelines"
DESCRIPTION = "Streamz helps you build pipelines to manage continuous streams of data."
LICENSE = "BSD-3-Clause"

PV = "0.6.4"

RPM_NAME = "python39-streamz-0.6.4-2.5.noarch.rpm"
RPM_HASH = "9cc664bacd40eaff42f3e0bd8f68d77fc92e6ab33d105a373a4a8d01cda34d7ebb9ee77a7c386a62328ad45f8d52f0e087357e3590134afd95089532b86de77f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-streamz \
python39-streamz \
python3dist-streamz"

RDEPENDS:${PN} += "python-abi \
python39-setuptools \
python39-six \
python39-toolz \
python39-tornado \
python39-zict"

inherit rpm
