SUMMARY = "Rust/Python Interoperability"
DESCRIPTION = "Build and publish crates with pyo3, rust-cpython and cffi bindings \
as well as rust binaries as python packages. \
 \
This project is a zero-configuration replacement for \
setuptools-rust milksnake. It supports building wheels for Python \
3.6+, can upload them to PyPI and has basic PyPy support."
LICENSE = "Apache-2.0 | MIT"

PV = "1.1.0"

RPM_NAME = "python39-maturin-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "89b123fef5444ed4a7c2f9039950df144a647a338eb6a6cf5fdc543d9c35ece131f553a884adc78b7db4bf26a8ecaa0f559a1c08d6c252158431e48409148e10"

RPROVIDES:${PN} += "python3.9dist-maturin \
python39-maturin \
python3dist-maturin"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi \
python39-tomli \
update-alternatives"

inherit rpm
