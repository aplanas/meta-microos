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

RPM_NAME = "python311-aioeventlet-0.5.2-4.5.noarch.rpm"
RPM_HASH = "927ff64a02c5f9a0a81ec61450bd4d6791dd0ffac2adbc0881599b5acbd0e27a2839ffb6625beb32a030d216731fe77357d3ed0f0ed0670bf21e0adb17f5fc99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aioeventlet \
python3.11dist-aioeventlet \
python311-aioeventlet \
python3dist-aioeventlet"

RDEPENDS:${PN} += "python-abi \
python311-eventlet"

inherit rpm
