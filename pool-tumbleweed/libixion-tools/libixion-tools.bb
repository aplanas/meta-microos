SUMMARY = "Spreadsheet file processing library"
DESCRIPTION = "Tools to use ixion parser and interpreter from cli."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "libixion-tools-0.17.0-3.4.aarch64.rpm"
RPM_HASH = "f79d7dec119cacd7629fd950a0a3a3254a4fe77b62834880295db375a4c232eda53d43534d6b73496526219350b7caa051578479d6e1e9c89480735e6e040d97"

RPROVIDES:${PN} += "libixion-tools \
libixion-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libboost_system.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libixion-0.17.so.0()(64bit) \
libixion-0_17-0 \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
