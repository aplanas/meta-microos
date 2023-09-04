SUMMARY = "Emoji for Python"
DESCRIPTION = "This Python module provides unicode emoji output for strings containing emoji codes. \
In addition to the official list defined by the unicode consortium a whole bunch of aliases is defined. \
 \
Example: \
>> import emoji \
>> print(emoji.emojize('Python is :thumbs_up:')) \
Python is 👍 \
>> print(emoji.emojize('Python is :thumbsup:', use_aliases=True)) \
Python is 👍 \
 \
By default, the language is English (``language='en'``). Further supported langauges are: \
* Spanish ('es') \
* Portuguese ('pt') \
* Italian ('it') \
* French ('fr') \
* German ('de') \
* Farsi/Persian ('fa') \
* Indonesian ('id') \
* Simplified Chinese ('zh') \
* Japanese ('ja') \
* Korean ('ko')"
LICENSE = "BSD-3-Clause"

PV = "2.8.0"

RPM_NAME = "python39-emoji-2.8.0-1.1.noarch.rpm"
RPM_HASH = "82c9440c674e8ec14f803d4d4a1e64446996364e626c254a12e6818271733b93123e02fd0d046c1857119dd75207ebdc060edd12012a063126e97b16ead490d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-emoji \
python39-emoji \
python3dist-emoji"

RDEPENDS:${PN} += "python-abi"

inherit rpm
