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

RPM_NAME = "python310-thespian-3.10.6-1.5.noarch.rpm"
RPM_HASH = "bc319e1a9a3246d9f3002997ff5a5dac9a2db2d7f038e7b9e4a098e4faf4ccb638717a676c1718e7e846c044832c8119a0c0144ea477e3380790c3b87b4d305d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-thespian \
python310-thespian \
python3dist-thespian"

RDEPENDS:${PN} += "python-abi \
python310-setproctitle"

inherit rpm
