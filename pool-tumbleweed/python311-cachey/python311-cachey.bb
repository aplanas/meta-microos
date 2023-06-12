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

RPM_NAME = "python311-cachey-0.2.1-2.3.noarch.rpm"
RPM_HASH = "e0220b1f8a6e85441a32577c3342a9efd58f5d978197b4b1bcafd20d16122ccc21da660a9f972d3cf43b1a90e638287a785db0555ce3bc01d079d1540bdffe29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cachey) \
python311-cachey \
python3dist(cachey)"
RDEPENDS:${PN} += "python(abi) \
python311-HeapDict"

inherit rpm
