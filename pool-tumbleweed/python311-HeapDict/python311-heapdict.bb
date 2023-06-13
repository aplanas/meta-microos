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

RPM_NAME = "python311-HeapDict-1.0.1-2.11.noarch.rpm"
RPM_HASH = "d05ac626e0e1395f5249f2b1e8b835de274bab179638c9af995ebb18598ebd4af34d4b32f0540798e34db77037279ebd2fdce0e43255fa09e64823b114440f29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(heapdict) \
python311-HeapDict \
python3dist(heapdict)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
