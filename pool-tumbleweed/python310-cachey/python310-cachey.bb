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

RPM_NAME = "python310-cachey-0.2.1-2.3.noarch.rpm"
RPM_HASH = "7f20078994cf05c0acdaed6b84b427aca20064cac5e33815af48bf4af139de42471d7b84b3b4c9771be469c71f74a40e0a95ba41533aefef739fe295ec36bef1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cachey \
python3.10dist-cachey \
python310-cachey \
python3dist-cachey"

RDEPENDS:${PN} += "python-abi \
python310-HeapDict"

inherit rpm
