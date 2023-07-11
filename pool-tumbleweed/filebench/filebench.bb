SUMMARY = "File system and storage benchmark"
DESCRIPTION = "Filebench is a file system and storage benchmark that allows to generate a \
large variety of workloads. Unlike typical benchmarks it is very flexible and \
allows to minutely specify (any) applications' behaviour using extensive \
Workload Model Language (WML). Filebench uses loadable workload personalities \
to allow easy emulation of complex applications (e.g., mail, web, file, and \
database servers). Filebench is quick to set up and easy to use compared to \
deploying real applications. It is also a handy tool for micro-benchmarking."
LICENSE = "CDDL-1.0"

PV = "1.4.9.1+git.20200220"

RPM_NAME = "filebench-1.4.9.1+git.20200220-1.1.aarch64.rpm"
RPM_HASH = "bef2400ee3810722c9e0ee113f92adf875003f7ca2642cf33fbd624bc99cc46037ca6bceaa8cf2ea4e8b5576ab6d709fe64b88eb586d596cc94aa86d40e40de1"

RPROVIDES:${PN} += "filebench \
libcvar-erlang.so.0 \
libcvar-exponential.so.0 \
libcvar-gamma.so.0 \
libcvar-lognormal.so.0 \
libcvar-normal.so.0 \
libcvar-triangular.so.0 \
libcvar-uniform.so.0 \
libcvar-weibull.so.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
