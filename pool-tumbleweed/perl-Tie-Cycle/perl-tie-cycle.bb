SUMMARY = "Cycle through a list of values via a scalar"
DESCRIPTION = "You use 'Tie::Cycle' to go through a list over and over again. Once you get \
to the end of the list, you go back to the beginning. You don't have to \
worry about any of this since the magic of tie does that for you. \
 \
The tie takes an array reference as its third argument. The tie should \
succeed unless the argument is not an array reference. Previous versions \
required you to use an array that had more than one element (what's the \
pointing of looping otherwise?), but I've removed that restriction since \
the number of elements you want to use may change depending on the \
situation. \
 \
During the tie, this module makes a shallow copy of the array reference. If \
the array reference contains references, and those references are changed \
after the tie, the elements of the cycle will change as well. See the \
included _test.pl_ script for an example of this effect."
LICENSE = "Artistic-2.0"

PV = "1.227"

RPM_NAME = "perl-Tie-Cycle-1.227-1.8.noarch.rpm"
RPM_HASH = "1db034302800c2e985c83bac26ff853ec4bc033eec9fc61123c72c8b072e9e898664bc41acfea0fc4fd5026f252bde1a5b325f47029ba419845e94c78d812730"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--Cycle \
perl-Tie-Cycle"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
