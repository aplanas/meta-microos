SUMMARY = "Distributed computing using remote objects"
DESCRIPTION = "Distob will take your existing python objects, or a sequence of \
objects, and scatter them onto many IPython parallel engines, which \
may be running on a single computer or on a cluster. \
 \
In place of the original objects, proxy objects are kept on the client \
computer that provide the same interface as the original objects. You \
can continue to use these as if the objects were still local. All \
methods are passed through to the remote objects, where computation is \
done. \
 \
In particular, sending numpy arrays to the cluster is supported. \
 \
A numpy array can also be scattered across the cluster, along a \
particular axis. Operations on the array can then be automatically \
done in parallel."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.3"

RPM_NAME = "python311-distob-0.3.3-3.9.noarch.rpm"
RPM_HASH = "372f4711b9e9ddd2ac3f9e1e8e8e32ab091758cff85c50d4aaf4a98584b6a535aade5ebf4d62bddf4b64130f1938b47cddffe526dd0ce86bc4c1aaa6a6e5f82f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-distob \
python3.11dist-distob \
python311-distob \
python3dist-distob"

RDEPENDS:${PN} += "python-abi \
python311-dill \
python311-ipyparallel \
python311-pyzmq"

inherit rpm
