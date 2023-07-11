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

RPM_NAME = "python310-HeapDict-1.0.1-2.13.noarch.rpm"
RPM_HASH = "ee58fc658e595cb70826ed793f4e4ca3b6959fe3d3a6bbfdc49104e399ad11af5fd48ece1e745e58233132eed0b697682c08cf379c535ef8cd3e0225d6c27245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-heapdict \
python310-HeapDict \
python3dist-heapdict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
