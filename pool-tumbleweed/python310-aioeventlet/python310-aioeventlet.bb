SUMMARY = "Asyncio event loop scheduling callbacks in eventlet"
DESCRIPTION = "aioeventlet implements the asyncio API (PEP 3156) on top of eventlet. It makes \
possible to write asyncio code in a project currently written for eventlet. \
 \
aioeventlet allows to use greenthreads in asyncio coroutines, and to use \
asyncio coroutines, tasks and futures in greenthreads: see ``link_future()`` \
and ``wrap_greenthread()`` functions. \
 \
The main visible difference between aioeventlet and trollius is the behaviour \
of ``run_forever()``: ``run_forever()`` blocks with trollius, whereas it runs \
in a greenthread with aioeventlet. It means that aioeventlet event loop can run \
in an greenthread while the Python main thread runs other greenthreads in \
parallel."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python310-aioeventlet-0.5.2-4.5.noarch.rpm"
RPM_HASH = "1a716d3d138096f5f727514385800c705fcf387929ef8e141fe0304e926d71b01ca277618d6df58b29536bb0e8500da77febd23369dfbf7765163bda9679910b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aioeventlet \
python310-aioeventlet \
python3dist-aioeventlet"

RDEPENDS:${PN} += "python-abi \
python310-eventlet"

inherit rpm
