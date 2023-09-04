SUMMARY = "Python library for Apache Arrow - header files"
DESCRIPTION = "Python library for Apache Arrow. \
 \
This package provides the header files within the python \
platlib for consuming modules using cythonization."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "12.0.1"

RPM_NAME = "python310-pyarrow-devel-12.0.1-2.1.aarch64.rpm"
RPM_HASH = "e3225d8352bd90f533677841d61005ada3e6333f3730a91f970395e5fd6def99b1b5b55deadc4defb6e0bb9d138ec4334e57cb45548f29eb31543d328928d264"

RPROVIDES:${PN} += "python310-pyarrow-devel"

RDEPENDS:${PN} += "python-abi \
python310-Cython \
python310-pyarrow"

inherit rpm
