SUMMARY = "A top-like tool for your Kubernetes clusters"
DESCRIPTION = "A top-like tool for your Kubernetes cluster. \
 \
Following the tradition of Unix/Linux top tools, ktop is a tool that displays useful metrics information about nodes, pods, and other workload resources running in a Kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "0.3.5"

RPM_NAME = "ktop-0.3.5-1.2.aarch64.rpm"
RPM_HASH = "6e77438878f0602124f5745c4a0af6fbf531935f215ba9b78bb8d5c62b1c853b0e32449164186646e3cc3e5c03713f5a8223292bc966a8b77c6a65ab00bebb14"

RPROVIDES:${PN} += "ktop \
ktop(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
