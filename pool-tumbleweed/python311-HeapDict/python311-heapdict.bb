SUMMARY = "A heap with decrease-key and increase-key operations"
DESCRIPTION = "HeapDict implements the MutableMapping ABC, meaning it works pretty \
much like a regular Python dict.  It's designed to be used as a \
priority queue. \
 \
Unlike the Python standard library's heapq module, the HeapDict \
supports efficiently changing the priority of an existing object \
(often called 'decrease-key' in textbooks).  Altering the priority is \
important for many algorithms such as Dijkstra's Algorithm and A*."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python311-HeapDict-1.0.1-2.13.noarch.rpm"
RPM_HASH = "537f2a7e60376e5330b63ab31ccaf6773bfd43aa0e6385f8ca1768ec3a41adde58db1114a7ab4aa3cc6d3dbc6c805fd9cf0159937619810a5952f91462963cf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-HeapDict \
python3.11dist-heapdict \
python311-HeapDict \
python3dist-heapdict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
