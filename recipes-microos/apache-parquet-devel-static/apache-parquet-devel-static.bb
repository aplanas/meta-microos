SUMMARY = "Development platform for in-memory data - development files"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the static library for the Parquet format."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "11.0.0"

RPM_NAME = "apache-parquet-devel-static-11.0.0-2.1.aarch64.rpm"
RPM_HASH = "3c5f5abda38570c7ba0ad64cad5203c2dae1044194b728df62fb8bd730ab6466c186036548645331a33a7e0e2c6ee4bde8cd0cfd34102633f22dbfc29a74b088"

RPROVIDES:${PN} += "apache-parquet-devel-static apache-parquet-devel-static(aarch-64)"
RDEPENDS:${PN} += "apache-parquet-devel"

inherit rpm
