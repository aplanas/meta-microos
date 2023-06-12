SUMMARY = "Rust/Python Interoperability"
DESCRIPTION = "Build and publish crates with pyo3, rust-cpython and cffi bindings \
as well as rust binaries as python packages. \
 \
This project is a zero-configuration replacement for \
setuptools-rust milksnake. It supports building wheels for Python \
3.6+, can upload them to PyPI and has basic PyPy support."
LICENSE = "Apache-2.0 | MIT"

PV = "1.0.1"

RPM_NAME = "python310-maturin-1.0.1-1.1.aarch64.rpm"
RPM_HASH = "baaebef3b290aad0b4ff6367d42a672c47928e11cf54c48d94ab7abd1d36ca75a5ba5f6118e8ab10c2ae44355af3c53bad6791a9576a65de137675dc057f5169"

RPROVIDES:${PN} += "python3-maturin \
python3.10dist(maturin) \
python310-maturin \
python310-maturin(aarch-64) \
python3dist(maturin)"
RDEPENDS:${PN} += "/bin/sh \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
python(abi) \
python310-tomli \
update-alternatives"

inherit rpm