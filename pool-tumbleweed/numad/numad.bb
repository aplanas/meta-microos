SUMMARY = "Userspace daemon that automatically binds workloads to NUMA nodes"
DESCRIPTION = "numad is a userspace daemon that monitors NUMA usage and resource usage \
and attempts to configure workloads using cpusets to use a subset of \
CPUs and memory nodes to maximise the number local memory access for \
best performance. Alternatively, it can be used to give hints as to how \
workloads should be manually bound to CPUs and memory nodes. This daemon \
is primarily intended for scenarios where there are multiple processes \
each which fit within a NUMA node. Examples of such configurations are \
virtual machine instances where each VM is smaller than a NUMA node \
or running multiple JVMs where each instance fits within a NUMA node. \
If the workload is one process that spans two or more nodes such as \
a large database server or a single JVM instance then numad is likely \
to regress performance."
LICENSE = "LGPL-2.1-only"

PV = "0.5.20130522"

RPM_NAME = "numad-0.5.20130522-8.8.aarch64.rpm"
RPM_HASH = "c42c5424b66eff03d8c4981bcaf338cc9f555a951052cac1b34ce557a7d32dcd141252ebf43124ef696870f7b0a3d125f51582744743cb09539bb42ed46dfebc"

RPROVIDES:${PN} += "config-numad \
numad"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
