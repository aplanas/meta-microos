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

RPM_NAME = "python311-cachey-0.2.1-2.5.noarch.rpm"
RPM_HASH = "1c8e03ecd5f661bcabd65802941db0d16b6f8d643a777e242de74a7fae819630ea01d9deba64836aa5fc39f569f1c4aa8a9b6ca3a577b77da5a1c2747630a0b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cachey \
python3.11dist-cachey \
python311-cachey \
python3dist-cachey"

RDEPENDS:${PN} += "python-abi \
python311-HeapDict"

inherit rpm
