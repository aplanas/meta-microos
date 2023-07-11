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

RPM_NAME = "python39-HeapDict-1.0.1-2.13.noarch.rpm"
RPM_HASH = "cee7da69fa33b7765a346b4dae8ad131da0b88f142c38671b7bbfbe019212c9b195524d33583183679b87fa359508fd3410fe3e8eaf6246864fe9283019ef16d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-heapdict \
python39-HeapDict \
python3dist-heapdict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
