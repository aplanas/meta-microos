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

RPM_NAME = "python310-distob-0.3.3-3.9.noarch.rpm"
RPM_HASH = "37f9734d1dd7825a813419e69bde46129308c10e9609b4438bfb467a8b09f799f4349ad66bbfc97d658a010ab9e8b9a07686cf9e2231f606165162537db7ca45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-distob \
python310-distob \
python3dist-distob"

RDEPENDS:${PN} += "python-abi \
python310-dill \
python310-ipyparallel \
python310-pyzmq"

inherit rpm
