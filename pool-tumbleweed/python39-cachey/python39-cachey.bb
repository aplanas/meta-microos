SUMMARY = "A Python cache mindful of computation/storage costs"
DESCRIPTION = "Cachey tries to hold on to values that have the following characteristics \
 \
1. Expensive to recompute (in seconds) \
2. Cheap to store (in bytes) \
3. Frequently used \
4. Recenty used \
 \
It accomplishes this by adding the following to each items score on each access \
 \
    score += compute_time / num_bytes * (1 + eps) ** tick_time \
 \
For some small value of epsilon (which determines the memory halflife). This \
has units of inverse bandwidth, has exponential decay of old results and \
roughly linear amplification of repeated results."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python39-cachey-0.2.1-2.3.noarch.rpm"
RPM_HASH = "475e6a60e906bba5e41e32d6d1cadfc0fb62e28980f0b74dbad917b82baf3a804515b5be8ea1aae1bd40b78cbda2eed230c4545663264d33f58662a607afb53e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cachey) \
python39-cachey \
python3dist(cachey)"

RDEPENDS:${PN} += "python(abi) \
python39-HeapDict"

inherit rpm
