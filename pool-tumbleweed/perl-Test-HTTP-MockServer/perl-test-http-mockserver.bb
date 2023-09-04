SUMMARY = "Implement a mock HTTP server for use in tests"
DESCRIPTION = "Sometimes, when writing a test, you don't have to oportunity to do \
dependency injection of the type of transport used in a specific API. \
Sometimes that code willl unequivocally always use actual HTTP and the only \
control you have is over the host and port to which it will connect. \
 \
This class offer a simple way to mock the service being called. It does \
that by binding to a random port on localhost and allowing you to inspect \
which port that was. Using a random port means that this can be used by \
tests running in parallel on the same host. \
 \
The socket will be bound and listened on the main test process, such that \
the lifetime of the connection is defined by the lifetime of the test \
itself. \
 \
Since the socket will be already bound and listened to, the two conntrol \
methods (start_mock_server and stop_mock_server) fork only for the accept \
call, which means that it is safe to call start and stop several times \
during the test in order to change the expectations of the mocked code. \
 \
That allows you to easily configure the expectations of the mock server \
across each step of your test case. On the other hand, it also means that \
no state is shared between the code running in the mock server and the test \
code."
LICENSE = "Apache-2.0"

PV = "0.0.1"

RPM_NAME = "perl-Test-HTTP-MockServer-0.0.1-2.12.noarch.rpm"
RPM_HASH = "3e19686cce2cb62571a1545030e37b7bc90ba158d8b490c22d515d41d2135d5a9fb5ab0c82609c3eaaa6c77dd6a6b746c8d0168e5c4b35d4c6674fdcfb057c2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--HTTP--MockServer \
perl-Test--HTTP--MockServer--REST \
perl-Test-HTTP-MockServer"

RDEPENDS:${PN} += "libnss-usrfiles2 \
netcfg \
perl--MODULE-COMPAT-5.38.0 \
perl-HTTP--Parser \
perl-HTTP--Response \
perl-JSON--XS"

inherit rpm
