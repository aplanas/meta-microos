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

RPM_NAME = "python310-distob-0.3.3-3.7.noarch.rpm"
RPM_HASH = "0714abc0340aebf3c6d22140d8a7e355f9ee1ca3cef79d7953fe816f843b8f66441c2e0782f289148dfe10bd0e70a5c9b009fd5abae0a1b9a0498a1d4628b420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-distob \
python3.10dist-distob \
python310-distob \
python3dist-distob"

RDEPENDS:${PN} += "python-abi \
python310-dill \
python310-ipyparallel \
python310-pyzmq"

inherit rpm
