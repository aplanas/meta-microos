SUMMARY = "Rust/Python Interoperability"
DESCRIPTION = "Build and publish crates with pyo3, rust-cpython and cffi bindings \
as well as rust binaries as python packages. \
 \
This project is a zero-configuration replacement for \
setuptools-rust milksnake. It supports building wheels for Python \
3.6+, can upload them to PyPI and has basic PyPy support."
LICENSE = "Apache-2.0 | MIT"

PV = "1.1.0"

RPM_NAME = "python310-maturin-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "821589c586cc7fcc70d1ed4f0bca6fc8d94a77cb244dd362429a2372f724c96f3457c43bf96bb3fec7176684559a01e1fec4ae8eb475bad58d86cbc63791d219"

RPROVIDES:${PN} += "python3.10dist-maturin \
python310-maturin \
python3dist-maturin"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi \
python310-tomli \
update-alternatives"

inherit rpm
