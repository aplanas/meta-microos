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

RPM_NAME = "python311-thespian-3.10.6-1.5.noarch.rpm"
RPM_HASH = "b65487f043bdbf9edf9a569392f75f525303857e1b5bf9cba5fcf06aaa73a5d1f8dc969ab221a2a0a8f16875d5e221c58f9bb41373e5576d6d2ebf453767d3b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-thespian \
python3.11dist-thespian \
python311-thespian \
python3dist-thespian"

RDEPENDS:${PN} += "python-abi \
python311-setproctitle"

inherit rpm
