SUMMARY = "Python Actor concurrency library"
DESCRIPTION = "Thespian is a Python library providing a framework for developing \
concurrent, distributed, fault tolerant applications. \
 \
Thespian is built on the Actor Model which allows applications to be \
written as a group of independently executing but cooperating \
'Actors' which communicate via messages.  These Actors run within \
the Actor System provided by the Thespian library. \
 \
      * Concurrent \
      * Distributed \
      * Fault Tolerant \
      * Scalable \
      * Location independent \
 \
Actor programming is broadly applicable and it is ideally suited \
for Cloud-based applications as well, where compute nodes are \
added and removed from the environment dynamically. \
 \
   * More Information: http://thespianpy.com \
   * Release Notes: http://thespianpy.com/doc/releases.html"
LICENSE = "MIT"

PV = "3.10.6"

RPM_NAME = "python39-thespian-3.10.6-1.3.noarch.rpm"
RPM_HASH = "606f3bef0072dec04220b23e7263ef63cb9f1a72d5e1c785249cd1386841caa620817e8359b1c58a0168f0658f82665c1c6d46a2d6ff050a6edbbb27990140e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(thespian) \
python39-thespian \
python3dist(thespian)"

RDEPENDS:${PN} += "python(abi) \
python39-setproctitle"

inherit rpm
