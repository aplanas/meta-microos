SUMMARY = "File system and storage benchmark"
DESCRIPTION = "Filebench is a file system and storage benchmark that allows to generate a \
large variety of workloads. Unlike typical benchmarks it is very flexible and \
allows to minutely specify (any) applications' behaviour using extensive \
Workload Model Language (WML). Filebench uses loadable workload personalities \
to allow easy emulation of complex applications (e.g., mail, web, file, and \
database servers). Filebench is quick to set up and easy to use compared to \
deploying real applications. It is also a handy tool for micro-benchmarking."
LICENSE = "CDDL-1.0"

PV = "1.4.9.1"

RPM_NAME = "filebench-1.4.9.1-4.10.aarch64.rpm"
RPM_HASH = "e2b69a055fd92c64c336f052e7ba27fd555a3cbc942d62859141d006b6c58af12290273e6eb4b17a7fa954ce88b04205c7394f4dcbfe49ebd32556742d9aa8e4"

RPROVIDES:${PN} += "filebench filebench(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
