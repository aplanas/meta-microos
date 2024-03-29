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

RPM_NAME = "python39-distob-0.3.3-3.9.noarch.rpm"
RPM_HASH = "3bf5a6e8983d261a1d32937ff6a63209d315ba39501ae5a56009de518976ad7167fffb8f08028beeb211fd26c5669ea9a437500ccfa0418aaceae90abf69b4ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-distob \
python39-distob \
python3dist-distob"

RDEPENDS:${PN} += "python-abi \
python39-dill \
python39-ipyparallel \
python39-pyzmq"

inherit rpm
