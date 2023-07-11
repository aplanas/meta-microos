SUMMARY = "Jupyter widgets to help facilitate reuse of large datasets"
DESCRIPTION = "IPydatawidgets is a set of widgets to help facilitate reuse of large \
datasets across different widgets, and different packages. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "4.3.2"

RPM_NAME = "python39-ipydatawidgets-4.3.2-9.3.noarch.rpm"
RPM_HASH = "75f85c087b6a8a77b63f22aaca94512bb23e8e0b4eb171986eee460881a0e6dd92a2754bfd1420f34f31e46e5351569670426458d3aaa9d8b68de8d7613161b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ipydatawidgets \
python39-ipydatawidgets \
python39-jupyter-ipydatawidgets \
python3dist-ipydatawidgets"

RDEPENDS:${PN} += "jupyter-ipydatawidgets \
python-abi \
python39-ipywidgets \
python39-numpy \
python39-traittypes"

inherit rpm
