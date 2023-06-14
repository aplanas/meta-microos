SUMMARY = "The Visualization Toolkit - A high level 3D visualization library"
DESCRIPTION = "VTK is a software system for image processing, 3D graphics, volume \
rendering and visualization. VTK includes many advanced algorithms \
(e.g. surface reconstruction, implicit modelling, decimation) and \
rendering techniques (e.g. hardware-accelerated volume rendering, \
LOD control). \
 \
This package provides the shared libraries for VTK."
LICENSE = "BSD-3-Clause"

PV = "9.2.6"

RPM_NAME = "libvtk1-openmpi4-9.2.6-2.2.aarch64.rpm"
RPM_HASH = "bcedd18c4264428b251a5286f6c4add6be6051155a8be1f88ba9a14b05fe5d0d9095d0b66b0b7405cc3fd9e755c41f87e53ae073d3430bb93d46b739185ac8c0"

RPROVIDES:${PN} += "libvtk1-openmpi4 \
libvtkChartsCore.so.1 \
libvtkCommonColor.so.1 \
libvtkCommonComputationalGeometry.so.1 \
libvtkCommonCore.so.1 \
libvtkCommonDataModel.so.1 \
libvtkCommonExecutionModel.so.1 \
libvtkCommonMath.so.1 \
libvtkCommonMisc.so.1 \
libvtkCommonSystem.so.1 \
libvtkCommonTransforms.so.1 \
libvtkDICOMParser.so.1 \
libvtkDomainsChemistry.so.1 \
libvtkDomainsChemistryOpenGL2.so.1 \
libvtkDomainsParallelChemistry.so.1 \
libvtkFiltersAMR.so.1 \
libvtkFiltersCore.so.1 \
libvtkFiltersExtraction.so.1 \
libvtkFiltersFlowPaths.so.1 \
libvtkFiltersGeneral.so.1 \
libvtkFiltersGeneric.so.1 \
libvtkFiltersGeometry.so.1 \
libvtkFiltersHybrid.so.1 \
libvtkFiltersHyperTree.so.1 \
libvtkFiltersImaging.so.1 \
libvtkFiltersModeling.so.1 \
libvtkFiltersParallel.so.1 \
libvtkFiltersParallelGeometry.so.1 \
libvtkFiltersParallelImaging.so.1 \
libvtkFiltersParallelMPI.so.1 \
libvtkFiltersParallelVerdict.so.1 \
libvtkFiltersPoints.so.1 \
libvtkFiltersProgrammable.so.1 \
libvtkFiltersSMP.so.1 \
libvtkFiltersSelection.so.1 \
libvtkFiltersSources.so.1 \
libvtkFiltersStatistics.so.1 \
libvtkFiltersTexture.so.1 \
libvtkFiltersTopology.so.1 \
libvtkFiltersVerdict.so.1 \
libvtkGeovisCore.so.1 \
libvtkIOAMR.so.1 \
libvtkIOAsynchronous.so.1 \
libvtkIOCGNSReader.so.1 \
libvtkIOCONVERGECFD.so.1 \
libvtkIOCesium3DTiles.so.1 \
libvtkIOChemistry.so.1 \
libvtkIOCityGML.so.1 \
libvtkIOCore.so.1 \
libvtkIOEnSight.so.1 \
libvtkIOExodus.so.1 \
libvtkIOExport.so.1 \
libvtkIOExportPDF.so.1 \
libvtkIOGeometry.so.1 \
libvtkIOHDF.so.1 \
libvtkIOImage.so.1 \
libvtkIOImport.so.1 \
libvtkIOInfovis.so.1 \
libvtkIOLSDyna.so.1 \
libvtkIOLegacy.so.1 \
libvtkIOMINC.so.1 \
libvtkIOMPIImage.so.1 \
libvtkIOMPIParallel.so.1 \
libvtkIOMovie.so.1 \
libvtkIONetCDF.so.1 \
libvtkIOOggTheora.so.1 \
libvtkIOPLY.so.1 \
libvtkIOParallel.so.1 \
libvtkIOParallelNetCDF.so.1 \
libvtkIOParallelXML.so.1 \
libvtkIOSQL.so.1 \
libvtkIOSegY.so.1 \
libvtkIOTecplotTable.so.1 \
libvtkIOVeraOut.so.1 \
libvtkIOVideo.so.1 \
libvtkIOXML.so.1 \
libvtkIOXMLParser.so.1 \
libvtkImagingColor.so.1 \
libvtkImagingCore.so.1 \
libvtkImagingFourier.so.1 \
libvtkImagingGeneral.so.1 \
libvtkImagingHybrid.so.1 \
libvtkImagingMath.so.1 \
libvtkImagingMorphological.so.1 \
libvtkImagingSources.so.1 \
libvtkImagingStatistics.so.1 \
libvtkImagingStencil.so.1 \
libvtkInfovisCore.so.1 \
libvtkInfovisLayout.so.1 \
libvtkInteractionImage.so.1 \
libvtkInteractionStyle.so.1 \
libvtkInteractionWidgets.so.1 \
libvtkJava.so.1 \
libvtkParallelCore.so.1 \
libvtkParallelDIY.so.1 \
libvtkParallelMPI.so.1 \
libvtkParallelMPI4Py.so.1 \
libvtkRenderingAnnotation.so.1 \
libvtkRenderingContext2D.so.1 \
libvtkRenderingContextOpenGL2.so.1 \
libvtkRenderingCore.so.1 \
libvtkRenderingFreeType.so.1 \
libvtkRenderingFreeTypeFontConfig.so.1 \
libvtkRenderingHyperTreeGrid.so.1 \
libvtkRenderingImage.so.1 \
libvtkRenderingLOD.so.1 \
libvtkRenderingLabel.so.1 \
libvtkRenderingOpenGL2.so.1 \
libvtkRenderingSceneGraph.so.1 \
libvtkRenderingUI.so.1 \
libvtkRenderingVolume.so.1 \
libvtkRenderingVolumeOpenGL2.so.1 \
libvtkRenderingVtkJS.so.1 \
libvtkTestingRendering.so.1 \
libvtkViewsContext2D.so.1 \
libvtkViewsCore.so.1 \
libvtkViewsInfovis.so.1 \
libvtkWrappingTools.so.1 \
libvtkexodusII.so.1 \
libvtkkissfft.so.1 \
libvtkloguru.so.1 \
libvtkmetaio.so.1 \
libvtksys.so.1 \
vtk-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libGLX.so.0 \
libOpenGL.so.0 \
libX11.so.6 \
libc.so.6 \
libcgns.so.4.3 \
libdouble-conversion.so.3 \
libexpat.so.1 \
libfmt.so.9 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libhdf5.so.200 \
libhpdf.so \
libjpeg.so.8 \
libjsoncpp.so.25 \
liblz4.so.1 \
liblzma.so.5 \
libm.so.6 \
libmpi.so.40 \
libnetcdf.so.19 \
libogg.so.0 \
libpng16.so.16 \
libproj.so.25 \
libpugixml.so.1 \
libpython3.10.so.1.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtheoradec.so.1 \
libtheoraenc.so.1 \
libtiff.so.6 \
libverdict.so.1.4 \
libxml2.so.2 \
libz.so.1"

inherit rpm
