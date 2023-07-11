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

RPM_NAME = "python39-thespian-3.10.6-1.5.noarch.rpm"
RPM_HASH = "564c6fa6fdce9fb757a7c5c83a88432e515528703f4b6ade8ac37e3f40e1d1bbcc1f6fc99c09dd899c9b60aa142d40ef03fe230522181e7d97eec39ec91be8eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-thespian \
python39-thespian \
python3dist-thespian"

RDEPENDS:${PN} += "python-abi \
python39-setproctitle"

inherit rpm
